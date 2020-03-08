int[] intArray;

void setup(){
 
  size(700,700);
  
  intArray= new int[width];
  
 
  noStroke();

}

void draw(){
  background(255,255,255); 
  fill(0,255,0);
  
  for(int i = 0; i<intArray.length;i++){
    rect(i,height,1,-1*intArray[i]);
  }
  
  stepSort(intArray);
  
}


void randomize(){
  for(int i = 0; i<intArray.length;i++){
  int num = (int) random(0,height);
  intArray[i]=num;
  } 
}


void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}

void mousePressed(){
  randomize();
}
