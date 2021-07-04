/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_funcional;
import java.awt.Color; // libreria para poder meter los colores a los componentes
import java.awt.Container;// libreria para poder poner un contenedor
import java.awt.FlowLayout;// libreria para poder dar el tamaño a los botones
import java.awt.event.ActionEvent; // libreria para los eventos
import java.awt.event.ActionListener;
import javax.swing.*; // la libreria Swin para para agregar jButton, jTexfield, JLabel, etc.


     public class Calculadora extends JFrame implements ActionListener { // La clase calculadora se hereda de la clase jframe 
    
  private JButton btnsuma,btnresta,btnmulti,btndiv,btnBorrar,btnraiz,btnpotencia,btnsalir; // se declara todos los botones que se van utilizar para la frame
 private JTextField valor1,valor2,camporesultado; // se declaran los campos para poder agregar datos.
 JLabel label1,label2;// se agrega el Jlabel para poder indicar agregar textos en frame, en este caso son dos.
  
 
 public void Controles(){ // se agrega una clase de controladores en donde se definira las caracterisiticas de los componentes, textos,campos de texto.
   
      Container contenedor = getContentPane();// se agrega el contenedor que representa a cualquier componentes que pueda contener otro componente
      contenedor.setLayout( new FlowLayout()); // El flowLayout sirve para acomodar los componentes de manera horizontal
   label1 = new JLabel("Numero 1");
      contenedor.add(label1); // se agrega el labell para la etiqueta a agregar en el Frame
      valor1 = new JTextField(10);// se le agrega la JTexField para el fuente para el tamaño del boton
        contenedor.add(valor1);
     label2 = new JLabel("Numero 2");
      contenedor.add(label2);
      valor2 = new JTextField(10);
      contenedor.add(valor2);
      btnsuma = new JButton("+");// se instancia el boton para la operacion suma en el frame
      btnsuma.setForeground(Color.blue); // se agrega el setForeground para poner el color del fuente
        btnsuma.setBackground(Color.gray);// se agrega el setBackground para cambiar el color del boton.
      contenedor.add(btnsuma); // se agrega el boton al contenedor
      btnsuma.addActionListener(this); // va generar el componente en el contenedor
      btnresta = new JButton("-"); // se crea un nuevo boton para la resta.
      btnresta.setForeground(Color.blue);
        btnresta.setBackground(Color.gray);
      contenedor.add(btnresta);
      btnresta.addActionListener(this);
      btnmulti = new JButton("x");
      btnmulti.setForeground(Color.blue);
        btnmulti.setBackground(Color.gray);
      contenedor.add(btnmulti);
      btnmulti.addActionListener(this);
      btndiv = new JButton("÷");
       btndiv.setForeground(Color.blue);
        btndiv.setBackground(Color.gray);
      btndiv.addActionListener(this);
      contenedor.add(btndiv);
      btnraiz=new JButton("√");
        btnraiz.setBackground(Color.gray);
       btnraiz.setForeground(Color.blue);
      btnraiz.addActionListener(this);
      contenedor.add(btnraiz);
      btnpotencia=new JButton("^");
        btnpotencia.setForeground(Color.blue);
      btnpotencia.setBackground(Color.gray);
      btnpotencia.addActionListener(this);
      contenedor.add(btnpotencia);
      camporesultado = new JTextField(10);// se instancia un nuevo campo para texto agregando su tamaño
      contenedor.add(camporesultado);// se agrega el cuadro de texto al contenedor que sera el campo donde se arrojara el resultado.
      btnBorrar = new JButton("Borrar");
       btnBorrar.setBackground(Color.yellow);
      contenedor.add(btnBorrar);
      btnBorrar.addActionListener(this);
      btnsalir=new JButton("Salir");
      btnsalir.setBackground(Color.pink);
      contenedor.add(btnsalir);
      btnsalir.addActionListener(this);
 }
  
 public Calculadora(){ // se crea el metodo de calculadora
  
      super("Calculadora"); // se agrega el constructor super por que esta heredado de la clase JFrame y posteriormente se le agrega el titulo de la ventana
      //cargo controles
      Controles(); // este metodo es donde metimos todos los componentes y al momento de invocar este metodo se va ejecutar todoas las acciones que pusimos anteriormente
      setSize(380,200); // se le agrega el tamaño de la ventana
      setLocationRelativeTo(null);// con este metodo se esta Centrando la ventana
      setVisible(true); // para mostrar la ventana.
 }
  
  @Override
 public void actionPerformed(ActionEvent e) { // se le agrega el metodo actionPerformed es para poder agregar eventos a los componentes para que sea funcioanal.
     double  num1,num2,resu; // se le agrega tres variables para la separacion.
     String resultado; // se le agrega una variable de tipo string
        if (e.getSource()==btnsuma) { // la condicion if es para checar si se presiono el boton suma....
         if(valor1.getText().equals("") || valor2.getText().equals("")) // se ejecuta este condicion if toamndo en cuenta en cuenta que se tiene que agregar dos numeros 
         {
          JOptionPane.showMessageDialog(null, "Los datos no están completos", // en este apartado nos dira si no agregamos los datos que nos pide
          "Error",JOptionPane.WARNING_MESSAGE); // nos mandara un mensaje diceindo que los datos no estan completos
         }
         else{ // y si estan bien los datos se ejecutara 
          num1=Double.parseDouble(valor1.getText());// se convierte de tipo double num 
          num2=Double.parseDouble(valor2.getText());
          resu=num1+num2; // parte logica de la operacion 
          resultado=String.valueOf(resu);
          camporesultado.setText(resultado);
         }          
        }
        if (e.getSource()==btnresta) {// se agrega la condicion if para que al dar clic en el bton resta nos funcione
         if(valor1.getText().equals("") || valor2.getText().equals("")){ // este if es para checar si agrega los datos correctamente o no.
          JOptionPane.showMessageDialog(null, "Los datos no están completos",  // si los datos no estan completos nos mandara un mensaje
          "Error",JOptionPane.ERROR_MESSAGE); 
         }
         else{ // y si los datos esta bien se ejecutara el codigo 
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          resu=num1-num2; // fromula para calcular la resta
          resultado=String.valueOf(resu); // covertimos el resu en string para poder almacenarlo en la variable resultado.
          camporesultado.setText(resultado);
         }          
        } 
        if (e.getSource()==btnmulti) {
         if(valor1.getText().equals("") || valor2.getText().equals("")){
          JOptionPane.showMessageDialog(null, "Los datos no están completos",
          "Error",JOptionPane.ERROR_MESSAGE); 
         }
         else{
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          resu=num1*num2;
          resultado=String.valueOf(resu);
          camporesultado.setText(resultado);
         }          
        }
        if (e.getSource()==btndiv) {
         if(valor1.getText().equals("") || valor2.getText().equals(""))
         {
          JOptionPane.showMessageDialog(null, "Los datos no están Incompletos",
          "Error",JOptionPane.ERROR_MESSAGE);
         }
         
         else{
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          try{
           resu=num1/num2;
           resultado=String.valueOf(resu);
           camporesultado.setText(resultado);
          }
          catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null, "División entre cero NO PERMITIDA!",
            "Error",JOptionPane.ERROR_MESSAGE);
          }
           
         }  
        }
        if (e.getSource()==btnpotencia) {
         if(valor1.getText().equals("") || valor2.getText().equals(""))
         {
          JOptionPane.showMessageDialog(null, "Los datos no están completos",
          "Error",JOptionPane.ERROR_MESSAGE); 
         }
         else{
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          resu=Math.pow(num1,num2);
          resultado=String.valueOf(resu);
          camporesultado.setText(resultado);
         }          
        }
        if(e.getSource()==btnraiz)
        {
         if(valor1.getText().equals("") ){
          JOptionPane.showMessageDialog(null, "Dejaste en blanco el campo.",
          "Error",JOptionPane.ERROR_MESSAGE); 
         }
         else{ // si los datos estan completos se ejecutara el codigo
          num1=Double.parseDouble(valor1.getText());
          if(num1>=0) // si esto se cumple se ejecuta los siguientes codigos
          {
          resu=Math.sqrt(num1);// formula para calcular la raiz cuadrada
          resultado=String.valueOf(resu);
          camporesultado.setText(resultado);// el resulatdo se envia lal campo de resultado
          }
          else{// pero si ese numero ni es mayor o menor entonces se ejecuta los siguinetes codigos 
           JOptionPane.showMessageDialog(null, "Raíz negativa.",
          "Error",JOptionPane.ERROR_MESSAGE);   
          }
         }    
        }
          
        
        if (e.getSource()==btnBorrar){
         valor1.setText("");
            valor2.setText("");
            camporesultado.setText("");
       } 
        if(e.getSource()==btnsalir)
        {
         System.exit(0);   
        }
    }
     
    public static void main(String[] args) {
      JFrame.setDefaultLookAndFeelDecorated(true);// para la decoracion de la ventana
      Calculadora calc = new Calculadora();//Instanciamos la clase que creamos
      calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar ventana
    }
      
  
    
}



