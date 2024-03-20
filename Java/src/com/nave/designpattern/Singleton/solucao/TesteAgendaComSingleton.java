package com.nave.designpattern.Singleton.solucao;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaComSingleton
{
  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//    System.out.println("\nAgenda Singleton EAGER");
//    AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
//    AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
//
//    System.out.println(agenda1);
//    System.out.println(agenda2);
//
//    reservaDiaEAGER("Sexta");
//    reservaDiaEAGER("Sabado");
//
//    System.out.println("\nAgenda Singleton LAZY");
//
//    AgendaSingletonLAZY agendalazy1 = AgendaSingletonLAZY.getInstance();
//    AgendaSingletonLAZY agendalazy2 = AgendaSingletonLAZY.getInstance();
//
//    System.out.println(agendalazy1);
//    System.out.println(agendalazy2);
//
//    // Reflection
//    Constructor<AgendaSingletonLAZY> constructorCracked = AgendaSingletonLAZY.class.getDeclaredConstructor();
//    constructorCracked.setAccessible(true);
//    AgendaSingletonLAZY agendaCracked1 = constructorCracked.newInstance();
//    AgendaSingletonLAZY agendaCracked2 = constructorCracked.newInstance();
//
//    System.out.println(agendaCracked1);
//    System.out.println(agendaCracked2);
//
//    reservaDiaLAZY("Sexta");
//    reservaDiaLAZY("Sabado");

    System.out.println("\nAgenda Singleton Enum");
    AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
    AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();

    System.out.println(agenda1.hashCode());
    System.out.println(agenda2.hashCode());

    // Reflection
    Constructor<AgendaSingletonEnum> constructorCracked = AgendaSingletonEnum.class.getDeclaredConstructor();
    constructorCracked.setAccessible(true);
    AgendaSingletonEnum agendaCracked1 = constructorCracked.newInstance();
    AgendaSingletonEnum agendaCracked2 = constructorCracked.newInstance();

    System.out.println(agendaCracked1);
    System.out.println(agendaCracked2);

    reservaDiaEnum("Sexta");
    reservaDiaEnum("Sabado");
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

  public static void reservaDiaEnum(String data)
  {
    AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
    agenda.ocupa(data);

    System.out.println(agenda.getDias());
  }
}
