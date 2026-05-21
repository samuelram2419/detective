

import java.util.Scanner;

// ====================== Agente ======================
class Agente {
protected int id;
protected String nombre;
protected String agencia;
protected String rango;
protected String experiencia;
protected int edad;

public Agente(int id, String nombre, String agencia,
String rango, String experiencia, int edad) {

this.id = id;
this.nombre = nombre;
this.agencia = agencia;
this.rango = rango;
this.experiencia = experiencia;
this.edad = edad;
}

public void mostrarInfo() {
System.out.println(&quot;ID: &quot; + id);
System.out.println(&quot;Nombre: &quot; + nombre);
System.out.println(&quot;Agencia: &quot; + agencia);
System.out.println(&quot;Rango: &quot; + rango);

System.out.println(&quot;Experiencia: &quot; + experiencia);
System.out.println(&quot;Edad: &quot; + edad);
}
}

// ====================== Detective ======================
class Detective extends Agente {

private String especialidad;
private String armamento;

public Detective(int id, String nombre, String agencia,
String rango, String experiencia,
int edad, String especialidad,
String armamento) {

super(id, nombre, agencia, rango, experiencia, edad);

this.especialidad = especialidad;
this.armamento = armamento;
}

@Override
public void mostrarInfo() {
super.mostrarInfo();
System.out.println(&quot;Especialidad: &quot; + especialidad);
System.out.println(&quot;Armamento: &quot; + armamento);
}
}

// ====================== Policia ======================
class Policia extends Agente {

private String especialidad;
private String patrulla;
private String armamento;
private String turno;

public Policia(int id, String nombre, String agencia,
String rango, String experiencia,
int edad, String especialidad,
String patrulla, String armamento,
String turno) {

super(id, nombre, agencia, rango, experiencia, edad);

this.especialidad = especialidad;
this.patrulla = patrulla;
this.armamento = armamento;
this.turno = turno;
}

@Override
public void mostrarInfo() {
super.mostrarInfo();
System.out.println(&quot;Especialidad: &quot; + especialidad);
System.out.println(&quot;Patrulla: &quot; + patrulla);
System.out.println(&quot;Armamento: &quot; + armamento);

System.out.println(&quot;Turno: &quot; + turno);
}
}

// ====================== Espia mecha ======================
class Espia {
protected String nombreClave;
protected int simulacrosRealizados;
protected int agentesEntrenados;

public Espia(String nombreClave, int simulacrosRealizados, int agentesEntrenados) {
this.nombreClave = nombreClave;
this.simulacrosRealizados = simulacrosRealizados;
this.agentesEntrenados = agentesEntrenados;
}

public void InformarEntrenamientos() {
System.out.println(&quot;El instructor ejecutó simulacros y entrenó a agentes&quot;);
System.out.println(&quot;alias del espía: &quot; + nombreClave);
System.out.println(&quot;simulacros completados: &quot; + simulacrosRealizados);
System.out.println(&quot;agentes capacitados: &quot; + agentesEntrenados);
}
}

// ====================== Main unico ======================
public class Main {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

// ====================== Espia ======================
System.out.println(&quot;\n--- Sistema de espia ---&quot;);

Espia espiaBase = new Espia(&quot;Mecha Larga&quot;, 0, 0);
espiaBase.InformarEntrenamientos();

System.out.println(&quot;\nNuevo expediente de espía&quot;);

System.out.print(&quot;Nombre clave: &quot;);
String nombreClave = sc.nextLine();

System.out.print(&quot;Simulacros realizados: &quot;);
int simulacros = sc.nextInt();

System.out.print(&quot;Agentes entrenados: &quot;);
int agentes = sc.nextInt();
sc.nextLine();

Espia nuevoEspia = new Espia(nombreClave, simulacros, agentes);

System.out.println(&quot;\nInformación registrada del espía:&quot;);
nuevoEspia.InformarEntrenamientos();

// ====================== Agente ======================
System.out.println(&quot;\n--- Registro agente ---&quot;);

System.out.print(&quot;ID: &quot;);

int idA = sc.nextInt(); sc.nextLine();

System.out.print(&quot;Nombre: &quot;);
String nombreA = sc.nextLine();

System.out.print(&quot;Agencia: &quot;);
String agenciaA = sc.nextLine();

System.out.print(&quot;Rango: &quot;);
String rangoA = sc.nextLine();

System.out.print(&quot;Experiencia: &quot;);
String expA = sc.nextLine();

System.out.print(&quot;Edad: &quot;);
int edadA = sc.nextInt(); sc.nextLine();

Agente agente = new Agente(idA, nombreA, agenciaA, rangoA, expA, edadA);

// ====================== Detective ======================
System.out.println(&quot;\n--- Registro detective ---&quot;);

System.out.print(&quot;ID: &quot;);
int idD = sc.nextInt(); sc.nextLine();

System.out.print(&quot;Nombre: &quot;);
String nombreD = sc.nextLine();

System.out.print(&quot;Agencia: &quot;);

String agenciaD = sc.nextLine();

System.out.print(&quot;Rango: &quot;);
String rangoD = sc.nextLine();

System.out.print(&quot;Experiencia: &quot;);
String expD = sc.nextLine();

System.out.print(&quot;Edad: &quot;);
int edadD = sc.nextInt(); sc.nextLine();

System.out.print(&quot;Especialidad: &quot;);
String espD = sc.nextLine();

System.out.print(&quot;Armamento: &quot;);
String armD = sc.nextLine();

Detective detective = new Detective(idD, nombreD, agenciaD, rangoD, expD, edadD, espD,
armD);

// ====================== Policia ======================
System.out.println(&quot;\n--- Regristro policia ---&quot;);

System.out.print(&quot;ID: &quot;);
int idP = sc.nextInt(); sc.nextLine();

System.out.print(&quot;Nombre: &quot;);
String nombreP = sc.nextLine();

System.out.print(&quot;Agencia: &quot;);
String agenciaP = sc.nextLine();

System.out.print(&quot;Rango: &quot;);
String rangoP = sc.nextLine();

System.out.print(&quot;Experiencia: &quot;);
String expP = sc.nextLine();

System.out.print(&quot;Edad: &quot;);
int edadP = sc.nextInt(); sc.nextLine();

System.out.print(&quot;Especialidad: &quot;);
String espP = sc.nextLine();

System.out.print(&quot;Patrulla: &quot;);
String patP = sc.nextLine();

System.out.print(&quot;Armamento: &quot;);
String armP = sc.nextLine();

System.out.print(&quot;Turno: &quot;);
String turnP = sc.nextLine();

Policia policia = new Policia(idP, nombreP, agenciaP, rangoP, expP, edadP, espP, patP, armP,
turnP);

// ====================== Mostrar todo ======================
System.out.println(&quot;\n--- Informacion general ---&quot;);

agente.mostrarInfo();
detective.mostrarInfo();
policia.mostrarInfo();

System.out.println(&quot;\nSistema completo ejecutado correctamente.&quot;);

sc.close();
}
}
