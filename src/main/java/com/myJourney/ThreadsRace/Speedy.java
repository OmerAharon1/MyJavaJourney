package com.myJourney.ThreadsRace;

public class Speedy implements Runnable {
	private boolean flag = false;
	private Speedy speedy;
	private String name;

	public Speedy(String name) {
		super();
		this.name = name;
	}

	public Speedy(String name, Speedy speedy) {
		super();
		this.name = name;
		this.flag = flag;
		this.speedy = speedy;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public Speedy getSpeedy() {
		return speedy;
	}

	public void setSpeedy(Speedy speedy) {
		this.speedy = speedy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Start");
		this.flag = true;
		int i = 0;
		while (i < 10) {
			if (flag) {
				i++;
				System.out.println(i + name);
				if (i != 10) {
					try {
						Thread.sleep((int)(Math.random()*1000));
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
		}
		
		speedy.Stop();
		System.out.println("the winned is " + name);
	}

	public void Stop() {
		this.flag = false;
	}

}
