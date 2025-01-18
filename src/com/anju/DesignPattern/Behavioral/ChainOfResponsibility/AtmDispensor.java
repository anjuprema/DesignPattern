package com.anju.DesignPattern.Behavioral.ChainOfResponsibility;

interface AtmDispensor {
	void setNextDispensor(AtmDispensor nextDispensor);
	void dispenseMoney(Integer amount);	
}

class Rupee500Dispensor implements AtmDispensor{
	AtmDispensor nextDispensor;

	@Override
	public void setNextDispensor(AtmDispensor nextDispensor) {
		this.nextDispensor = nextDispensor;
	}

	@Override
	public void dispenseMoney(Integer amount) {
		if(amount > 500) {
			System.out.println("Dispensed " + (amount/500) + " * 500 = "+ (amount/500)*500);
			System.out.println("Remaning = "+ (amount%500));
			if(amount%500 > 0)
			this.nextDispensor.dispenseMoney(amount%500);
		} else {
			this.nextDispensor.dispenseMoney(amount);
		}
	}	
}


class Rupee100Dispensor implements AtmDispensor{
	AtmDispensor nextDispensor;

	@Override
	public void setNextDispensor(AtmDispensor nextDispensor) {
		this.nextDispensor = nextDispensor;
	}

	@Override
	public void dispenseMoney(Integer amount) {
		if(amount > 100) {
			System.out.println("Dispensed " + (amount/100) + " * 100 = "+ (amount/100)*100);
			System.out.println("Remaning = "+ (amount%100));
			if(amount%100 > 0)
			this.nextDispensor.dispenseMoney(amount%100);
		}else {
			this.nextDispensor.dispenseMoney(amount);
		}
	}	
}

class Rupee10Dispensor implements AtmDispensor{
	AtmDispensor nextDispensor;

	@Override
	public void setNextDispensor(AtmDispensor nextDispensor) {
		this.nextDispensor = nextDispensor;
	}

	@Override
	public void dispenseMoney(Integer amount) {
		if(amount > 10) {
			System.out.println("Dispensed " + (amount/10) + " * 10 = "+ (amount/10)*10);
			System.out.println("Remaning = "+ (amount%10));
			if(amount%10 > 0)
			this.nextDispensor.dispenseMoney(amount%10);
		}else {
			this.nextDispensor.dispenseMoney(amount);
		}
	}	
}
