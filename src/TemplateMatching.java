//import org.opencv.core.Core;
//import org.opencv.core.Core.MinMaxLocResult;
//import org.opencv.core.Mat;
//import org.opencv.core.Point;
//import org.opencv.core.Scalar;
//import org.opencv.imgcodecs.Imgcodecs;
//import org.opencv.imgproc.Imgproc;
//
//public class TemplateMatching {
//
//    public static void main(String[] args) {
//
//        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//        Mat source=null;
//        Mat template=null;
//        String filePath="C:\\Users\\mesutpiskin\\Desktop\\Object Detection\\Template Matching\\Sample Image\\";
//        //Load image file
//        source=Imgcodecs.imread(filePath+"kapadokya.jpg");
//        template=Imgcodecs.imread(filePath+"balon.jpg");
//
//        Mat outputImage=new Mat();
//        int machMethod=Imgproc.TM_CCOEFF;
//        //Template matching method
//        Imgproc.matchTemplate(source, template, outputImage, machMethod);
//
//
//        MinMaxLocResult mmr = Core.minMaxLoc(outputImage);
//        Point matchLoc=mmr.maxLoc;
//        //Draw rectangle on result image
//        Imgproc.rectangle(source, matchLoc, new Point(matchLoc.x + template.cols(),
//                matchLoc.y + template.rows()), new Scalar(255, 255, 255));
//
//        Imgcodecs.imwrite(filePath+"sonuc.jpg", source);
//        System.out.println("Complated.");
//    }
//
//}

import org.opencv.imgproc.Imgproc;

public class TemplateMatching {
    public static void main(String[] args) {
        System.loadLibrary("opencv_java249");
        new MatchingDemo().run( "wool-laundry-care-label.png","laundry-do-not-bleach-icon.png", "res.png", Imgproc.TM_CCOEFF);
    }
}