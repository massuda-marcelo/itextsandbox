package localhost.sandbox.itext;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GraphExample extends JPanel {
	Ellipse2D.Double circle, oval, leaf, stem;
	Area circ, ov, leaf1, leaf2, st1, st2;

	public GraphExample() {
		circle = new Ellipse2D.Double();
		oval = new Ellipse2D.Double();
		leaf = new Ellipse2D.Double();
		stem = new Ellipse2D.Double();
		circ = new Area(circle);
		ov = new Area(oval);
		leaf1 = new Area(leaf);
		leaf2 = new Area(leaf);
		st1 = new Area(stem);
		st2 = new Area(stem);
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		double ew = 75;
		double eh = 75;
		g2.setColor(Color.GREEN);
		leaf.setFrame(ew - 16, eh - 29, 15.0, 15.0);
		leaf1 = new Area(leaf);
		leaf.setFrame(ew - 14, eh - 47, 30.0, 30.0);
		leaf2 = new Area(leaf);
		leaf1.intersect(leaf2);
		g2.fill(leaf1);
		leaf.setFrame(ew + 1, eh - 29, 15.0, 15.0);
		leaf1 = new Area(leaf);
		leaf2.intersect(leaf1);
		g2.fill(leaf2);
		g2.setColor(Color.BLACK);
		stem.setFrame(ew, eh - 42, 40.0, 40.0);
		st1 = new Area(stem);
		stem.setFrame(ew + 3, eh - 47, 50.0, 50.0);
		st2 = new Area(stem);
		st1.subtract(st2);
		g2.fill(st1);
		g2.setColor(Color.YELLOW);
		circle.setFrame(ew - 25, eh, 50.0, 50.0);
		oval.setFrame(ew - 19, eh - 20, 40.0, 70.0);
		circ = new Area(circle);
		ov = new Area(oval);
		circ.add(ov);
		g2.fill(circ);
	}
}
