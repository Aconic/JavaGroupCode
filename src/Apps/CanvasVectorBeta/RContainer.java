package Apps.CanvasVectorBeta;

public class RContainer //extends JPanel
{

    public RContainer(PanelFigures panelFigures)
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

        panelFigures.addSizeChangeListener(rTopLeft);
        panelFigures.addSizeChangeListener(rMidLeft);
        panelFigures.addSizeChangeListener(rBotLeft);

        panelFigures.addSizeChangeListener(rTopRight);
        panelFigures.addSizeChangeListener(rMidRight);
        panelFigures.addSizeChangeListener(rBotRight);

        panelFigures.addSizeChangeListener(rTopCentre);
        panelFigures.addSizeChangeListener(rBotCentre);
    }
}
