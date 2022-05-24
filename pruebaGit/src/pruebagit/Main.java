package pruebagit;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Profesor profeUno = new Profesor();
        Profesor profeDos = new Profesor();
        Estudiante estudiando = new Estudiante();

        profeUno.setNombre(JOptionPane.showInputDialog("Digite el nombre del profesor : "));
        profeUno.setApellido(JOptionPane.showInputDialog("Favor digite el primer apellido del profesor : "));
        profeUno.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del profesor : ")));
        profeUno.setProvincia(JOptionPane.showInputDialog("Digite el lugar de residencia del profesor : "));

        profeDos.setNombre(JOptionPane.showInputDialog("Digite el nombre del profesor : "));
        profeDos.setApellido(JOptionPane.showInputDialog("Favor digite el primer apellido del profesor : "));
        profeDos.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del profesor : ")));
        profeDos.setProvincia(JOptionPane.showInputDialog("Digite el lugar de residencia del profesor : "));

        estudiando.setNombre(JOptionPane.showInputDialog("Digite el nombre del estudiante : "));
        estudiando.setApellido(JOptionPane.showInputDialog("Digite el apellido del estudiante: "));
        estudiando.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del estudiante : ")));
        estudiando.setProvincia(JOptionPane.showInputDialog("Digite donde vive el estudiante: "));

        JOptionPane.showMessageDialog(null,
                "El profesor #1 se llama " + profeUno.getNombre() + " " + profeUno.getApellido() + " tiene una edad de " + profeUno.getEdad() + " y vive en " + profeUno.getProvincia() + "\n\n"
                + "El profesor #2 se llama " + profeUno.getNombre() + " " + profeUno.getApellido() + " tiene una edad de " + profeUno.getEdad() + " y vive en " + profeUno.getProvincia() + "\n\n"
                + "El estudiante seleccionado se llama : "+estudiando.getNombre()+" "+estudiando.getApellido()+" teniendo una edad de "+estudiando.getEdad()+" y vive en la provincia de "+estudiando.getProvincia());

    }

}
