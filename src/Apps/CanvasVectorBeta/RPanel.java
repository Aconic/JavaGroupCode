package Apps.CanvasVectorBeta;


import javax.swing.*;

public class RPanel extends JPanel
{
    RMidLeft rMidLeft;
    RBotLeft rBotLeft;
    RTopLeft rTopLeft;
    PanelFigures panelFigures;

    public RPanel(PanelFigures panelFigures)
    {
        this.panelFigures = panelFigures;

        rTopLeft = new RTopLeft(panelFigures);
        rMidLeft = new RMidLeft(panelFigures);
        rBotLeft = new RBotLeft(panelFigures);


        panelFigures.add(rTopLeft);
        panelFigures.add(rMidLeft);
        panelFigures.add(rBotLeft);

    }





}
