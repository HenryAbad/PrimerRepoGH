package com.company.Modelos;

public class ReceiverSound extends Artefacto {
  public String getNumerocnx() {
    return numerocnx;
  }

  public ReceiverSound(String marca, String color, String numerocnx, boolean usb) {
    super(marca, color);
    this.numerocnx = numerocnx;
    this.usb = usb;
  }

  public void setNumerocnx(String numerocnx) {
    this.numerocnx = numerocnx;
  }

  public boolean isUsb() {
    return usb;
  }

  public void setUsb(boolean usb) {
    this.usb = usb;
  }

  @Override
  public void ver(){
    System.out.println("Empece a ver mi Receiver");
  }

  private String numerocnx;
  private boolean usb;

}
