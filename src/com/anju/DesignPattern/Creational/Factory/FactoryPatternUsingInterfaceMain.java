package com.anju.DesignPattern.Creational.Factory;

interface ProtocolManager{
	String getProtocol();
	void setProtocolName(String protocolName);
}

class CTProtocol implements ProtocolManager{
	String protocolName;
	public String getProtocol() {
		return protocolName+" :: CT Protocol";
	}
	
	public void setProtocolName(String p) {
		protocolName = p;
	}
}

class PETProtocol implements ProtocolManager{
	String protocolName;
	public String getProtocol() {
		return protocolName+" :: PET Protocol";
	}
	
	public void setProtocolName(String p) {
		protocolName = p;
	}
}

class FactoryObjectProvider{
	public ProtocolManager getObject(String type) {
		if(type.equals("CT")) return new CTProtocol();
		else if(type.equals("PET")) return new PETProtocol();
		
		return null;
	}
}

public class FactoryPatternUsingInterfaceMain {

	public static void main(String[] args) {
		FactoryObjectProvider fp = new FactoryObjectProvider();
		ProtocolManager ct = fp.getObject("CT");
		ct.setProtocolName("anju");
		System.out.println(ct.getProtocol());
		
		ProtocolManager pet = fp.getObject("PET");
		pet.setProtocolName("appu");
		System.out.println(pet.getProtocol());

	}

}
