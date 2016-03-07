/*Write a program which will extend slider frame class and than will show the values*/
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
public class Slider_frame extends JFrame
{
      private final JSlider diameterJSlider;
       private final OvalPanel myPanel;

    public Slider_frame()
    {
        super("Slider Demo");
        myPanel=new OvalPanel();
        myPanel.setBackground(Color.BLACK);
        diameterJSlider=new JSlider(SwingConstants.HORIZONTAL,0,400,10);
        diameterJSlider.setMajorTickSpacing(100);
        diameterJSlider.setPaintTicks(true);
        diameterJSlider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        myPanel.setDiameter(diameterJSlider.getValue());
                    }
                }
        );
        add(diameterJSlider, BorderLayout.SOUTH);
        add(myPanel,BorderLayout.CENTER);
    }

}