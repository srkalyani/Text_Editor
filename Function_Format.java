
import java.awt.Font;
public class Function_Format {
    GUI gui;
    Font arial, comicSansMS, timesNewRoman;
    String selectedFont;
    public Function_Format(GUI gui)
    {
        this.gui=gui;
    }
    public void wordWrap()
    {
        if(gui.wordWrapOn==false)
        {
            gui.wordWrapOn=true;
            gui.textArea.setLineWrap(true);
            gui.textArea.setWrapStyleWord(true);
            gui.iwrap.setText("Word Wrap:On");
        } else if (gui.wordWrapOn==true)
        {
            gui.wordWrapOn=false;
            gui.textArea.setLineWrap(false);
            gui.textArea.setWrapStyleWord(false);
            gui.iwrap.setText("Word Wrap:Off");
        }
    }
    public  void createFont(int fontSize)
    {
        arial=new Font("Arial", Font.PLAIN,fontSize );
        comicSansMS=new Font("Comic Sans MS", Font.PLAIN,fontSize );
        timesNewRoman=new Font("Arial", Font.PLAIN,fontSize );
    }
    public  void setFont(String font)
    {
        selectedFont=font;
        switch (selectedFont)
                {
                    case "Arial":
                        gui.textArea.setFont(arial);
                        break;
                    case "Comic Sans MS":
                        gui.textArea.setFont(comicSansMS);
                        break;
                    case "times New Romen":
                        gui.textArea.setFont(timesNewRoman);
                        break;
                }
    }

}
