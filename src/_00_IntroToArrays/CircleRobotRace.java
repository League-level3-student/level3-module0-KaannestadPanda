package _00_IntroToArrays;



import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CircleRobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
		int startX=800;
		int startY=600;
	
		//2. create an array of 5 robots.
Robot[] robots = new Robot[8];
int verticalSpacer=startY/2/(2*(robots.length));  300
		//3. use a for loop to initialize the robots.

for(int i = 0;i<robots.length;i++) {
	robots[i]=new Robot();
	robots[i].setY(startY+verticalSpacer*i); 600
	robots[i].setX(startX);
	robots[i].setSpeed(100);
	robots[i].turn(90);
	robots[i].miniaturize();
	robots[i].penDown();
}




			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 600.
Boolean raceOver=false;

Random ran = new Random();

while(raceOver==false) {
	
for(int i = 0;i<robots.length;i++) {
	robots[i].setSpeed(7000);
	
		for(int k=0;k<ran.nextInt(450);k++) {
		robots[i].move(i+1);
		robots[i].turn(-1);
	}

if(robots[i].getX()==startX&&robots[i].getY()<=) {
	//raceOver=true;
}

	}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
//    	for(int i = 0;i<robots.length;i++) {
//    		if(robots[i].getY()<=0) {
//    			robots[i].setSpeed(200);
//    			robots[i].move(-600);
//    			robots[i].move(600);
//    			robots[i].move(-600);
//    			robots[i].move(600);
//    			robots[i].move(-600);
//    			robots[i].move(600);
//    			robots[i].move(-600);
//    			robots[i].move(600);
//    			robots[i].move(-600);
//    			robots[i].move(600);
//    			robots[i].move(-600);
//    			robots[i].move(600);
//    			robots[i].move(-600);
//    			robots[i].move(600);
//    			robots[i].move(-600);
//    			robots[i].move(600);
//    			robots[i].move(-600);
//    			robots[i].move(600);
//    			robots[i].move(-600);
//    			robots[i].move(600);
//    			robots[i].move(-600);
//    			robots[i].move(600);
//    			robots[i].move(-600);
//    			robots[i].move(600);
//    			
//    		}
//    	}
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

    	
    	
	}
	}
}


