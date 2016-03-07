/*This class will combine the previous classes and than will show the SLiderDemo in working form.*/
import javax.swing.JFrame;
public class SliderDemo extends JFrame
{
    public static void main(String[] args)
    {
        Slider_frame slider = new Slider_frame();
        slider.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        slider.setSize(600, 600);
        slider.setVisible(true);
    }

}