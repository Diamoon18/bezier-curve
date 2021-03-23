# Bezier-curve 2d Java
My nickname - Di using Bezier curve.
# Start with sketch (check points)
![przed](https://user-images.githubusercontent.com/72127610/112198008-f9994600-8c0c-11eb-87c2-bfc2519da0b1.jpg)
soure: https://www.victoriakirst.com/beziertool/
# Derivation of the formula for 3rd-degree curves
![formula](https://user-images.githubusercontent.com/72127610/112204776-5b10e300-8c14-11eb-854a-217026d39d9c.jpg)
# Code explanation
## Application
This is the entry point of the application. Here we have the main method.\
Here we put the Board to the center of the JFrame container.
```java
add(new Board());
```
This line sets the size of the window.
```java
setSize(WIDTH, HEIGHT);
```
Set the name of the application.\
This will close the application when we click on the close button.\
Passing null to the setLocationRelativeTo() method centers the window on the screen.
```java
setTitle("Di");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
```
We create an instance of our code example and make it visible on the screen.
```java
public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application ex = new Application();
            ex.setVisible(true);
        });
}
```
## Board
The Board is a panel where the initials will be drawn.\
Variable initialization:\
*array with the value of x\
*array with the value of y\
*auxiliary points (x, y)
```java
    double x[][] = new double[26][4];
    double y[][] = new double[26][4];
    double px;
    double py;
```
Setting individual points.
```java
public void setValues(){
		    x[0][0] = 157;
   	  		y[0][0] = 69; 
   	  	 x[0][1] = 191;
   	  	 	y[0][1] = 41;
   	  	 x[0][2] = 203;
   	  	 	y[0][2] = 297;
   	  	 x[0][3] = 159;
   	  	 	y[0][3] = 299;
   	  	 	
   	  	....
 }
```
Drawing method.\
We invoke methods setValues() and drawBeziere().
```java
@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setValues();
        drawBeziere(g);
    }
```
### Method drawBeziere()
We create an object of the Graphics2D class.
```java
Graphics2D g2d = (Graphics2D) g;
```
We set the black background and the color of the line drawing.
```java
g2d.setBackground(Color.BLACK);
g2d.fillRect(0, 0, 900, 600);
g2d.setColor(Color.CYAN);
```

```java
    for(int i = 0; i < 26; i++) {
        	for(double t = 0.0; t <= 1.0; t+=0.005) {
            	px = Math.pow(1-t, 3)*x[i][0] + 3*t*Math.pow(1-t, 2)*x[i][1] + 3*t*t*Math.pow(1-t, 1)*x[i][2] + Math.pow(t, 3) * x[i][3];
            	py = Math.pow(1-t, 3)*y[i][0] + 3*t*Math.pow(1-t, 2)*y[i][1] + 3*t*t*Math.pow(1-t, 1)*y[i][2] + Math.pow(t, 3) * y[i][3];
            	g2d.drawLine((int)px, (int)py, (int)px, (int)py);
           }
    }
```


# Result:
![wynik](https://user-images.githubusercontent.com/72127610/112197541-7d9efe00-8c0c-11eb-8ef1-c90d2ac6b4ec.jpg)
