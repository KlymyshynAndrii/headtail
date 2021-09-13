package HomeWork;

public class BodyMass {
    public static void main(String[] args) {
        double h=67, w=197.5, H,W;
        // h - is high in inch, w - is weight in pound, H- high in meter, W- weight in pounds
        double inchToM=0.0254, lbToKg=0.454;
         H=h*inchToM;
         W=w*lbToKg;
        double BMI= W/(H*H);
        System.out.println("My high is "+H+", my weight is "+W);
        System.out.println("My Body Mass Index is "+BMI);
    }
}
