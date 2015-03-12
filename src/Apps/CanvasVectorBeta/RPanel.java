package Apps.CanvasVectorBeta;

import javax.swing.*;

public class RPanel extends JPanel
{

    public RPanel(PanelFigures panelFigures)
    {
        RTopLeft rTopLeft = new RTopLeft(panelFigures);
        RMidLeft rMidLeft = new RMidLeft(panelFigures);
        RBotLeft rBotLeft = new RBotLeft(panelFigures);

        RTopRight rTopRight = new RTopRight(panelFigures);
        RMidRight rMidRight = new RMidRight(panelFigures);
        RBotRight rBotRight = new RBotRight(panelFigures);

        RTopCentre rTopCentre = new RTopCentre(panelFigures);
        RBotCentre rBotCentre = new RBotCentre(panelFigures);

        panelFigures.add(rTopLeft);
        panelFigures.add(rMidLeft);
        panelFigures.add(rBotLeft);

        panelFigures.add(rTopRight);
        panelFigures.add(rMidRight);
        panelFigures.add(rBotRight);

        panelFigures.add(rTopCentre);
        panelFigures.add(rBotCentre);
    }
}
