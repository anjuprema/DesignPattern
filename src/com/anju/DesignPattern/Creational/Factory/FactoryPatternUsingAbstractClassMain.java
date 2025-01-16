package com.anju.DesignPattern.Creational.Factory;

abstract class ProtocolManagerAbstract{
	String protocolName;
	abstract String getProtocol();
	abstract void setProtocolName(String protocolName);
}

class CTProtocolAbstract extends ProtocolManagerAbstract{
	public String getProtocol() {
		return protocolName+" :: CT Protocol";
	}
	
	public void setProtocolName(String p) {
		protocolName = p;
	}
}

class PETProtocolAbstract extends ProtocolManagerAbstract{
	public String getProtocol() {
		return protocolName+" :: PET Protocol";
	}
	
	public void setProtocolName(String p) {
		protocolName = p;
	}
}

class FactoryObjectProviderAbstract{
	public ProtocolManagerAbstract getObject(String type) {
		if(type.equals("CT")) return new CTProtocolAbstract();
		else if(type.equals("PET")) return new PETProtocolAbstract();
		
		return null;
	}
}
public class FactoryPatternUsingAbstractClassMain {

	public static void main(String[] args) {
		FactoryObjectProviderAbstract fp = new FactoryObjectProviderAbstract();
		ProtocolManagerAbstract ct = fp.getObject("CT");
		ct.setProtocolName("ct provider -> ");
		System.out.println(ct.getProtocol());
		
		ProtocolManagerAbstract pet = fp.getObject("PET");
		pet.setProtocolName("pet provider -> ");
		System.out.println(pet.getProtocol());
		System.out.println(ct.getProtocol());

	}

}
