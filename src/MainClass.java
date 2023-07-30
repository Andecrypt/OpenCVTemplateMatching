import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

public class MainClass {

    public MainClass() {
        Mat image = Highgui.imread("label.png");
        System.out.println((image.size()));
    }

    public static void main(String[] args) {
        System.loadLibrary("opencv_java249");
        new MainClass();

    }

}