package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
		//2. create an array of 5 robots.
Robot[] robots = new Robot[400];
		//3. use a for loop to initialize the robots.
int divido=2000/robots.length;
for(int i = 0;i<robots.length;i++) {
	robots[i]=new Robot();
	robots[i].setY(800);
	robots[i].setX(divido*i+divido/2);
	robots[i].setSpeed(500);
	robots[i].miniaturize();
}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 600.
Boolean raceOver=false;

Random ran = new Random();

while(raceOver==false) {
	
for(int i = 0;i<robots.length;i++) {
	
	
	robots[i].move(ran.nextInt(200));
		

	if(robots[i].getY()<=0) {
		raceOver=true;
		break;
	}

	}
}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	for(int i = 0;i<robots.length;i++) {
    		if(robots[i].getY()<=0) {
    			robots[i].setSpeed(200);
    			robots[i].move(-600);
    			robots[i].move(600);
    			robots[i].move(-600);
    			robots[i].move(600);
    			robots[i].move(-600);
    			robots[i].move(600);
    			robots[i].move(-600);
    			robots[i].move(600);
    			robots[i].move(-600);
    			robots[i].move(600);
    			robots[i].move(-600);
    			robots[i].move(600);
    			robots[i].move(-600);
    			robots[i].move(600);
    			robots[i].move(-600);
    			robots[i].move(600);
    			robots[i].move(-600);
    			robots[i].move(600);
    			robots[i].move(-600);
    			robots[i].move(600);
    			robots[i].move(-600);
    			robots[i].move(600);
    			robots[i].move(-600);
    			robots[i].move(600);
    			
    		}
    	}
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

    	
    	
	}
	}

