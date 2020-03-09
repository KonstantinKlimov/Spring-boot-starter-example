package by.konstantinklimov.simplestarter;

public class SimpleService {

  private final SimpleMessage simpleMessage;

  public SimpleService(SimpleMessage simpleMessage) {
    this.simpleMessage = simpleMessage;
  }

  public void sayMessage() {
    System.out.println(simpleMessage.getMessage());
  }
}
