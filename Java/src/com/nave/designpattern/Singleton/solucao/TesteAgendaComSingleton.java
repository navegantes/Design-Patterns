package com.nave.designpattern.Singleton.solucao;


public class TesteAgendaComSingleton
{
  public static void main(String[] args)
  {
    System.out.println("\nAgenda Singleton EAGER");
    AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
    AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();

    System.out.println(agenda1);
    System.out.println(agenda2);

    reservaDiaEAGER("Sexta");
    reservaDiaEAGER("Sabado");

    System.out.println("\nAgenda Singleton LAZY");

    AgendaSingletonLAZY agendalazy1 = AgendaSingletonLAZY.getInstance();
    AgendaSingletonLAZY agendalazy2 = AgendaSingletonLAZY.getInstance();

    System.out.println(agendalazy1);
    System.out.println(agendalazy2);

    reservaDiaLAZY("Sexta");
    reservaDiaLAZY("Sabado");
  }

  public static void reservaDiaEAGER(String data)
  {
    AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
    agenda.ocupa(data);

    System.out.println(agenda.getDias());
  }

  public static void reservaDiaLAZY(String data)
  {
    AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
    agenda.ocupa(data);

    System.out.println(agenda.getDias());
  }
}
