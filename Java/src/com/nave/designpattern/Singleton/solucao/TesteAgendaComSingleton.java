package com.nave.designpattern.Singleton.solucao;


public class TesteAgendaComSingleton
{
  public static void main(String[] args)
  {
    reservaDiaEAGER("Sexta");
    reservaDiaEAGER("Sabado");
  }

  public static void reservaDiaEAGER(String data)
  {
    AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
    agenda.ocupa(data);

    System.out.println(agenda.getDias());
  }
}
