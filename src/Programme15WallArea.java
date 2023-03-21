public class Programme15WallArea {
    double width; //instance variable
    double height;

    public Programme15WallArea() {
    }
    public Programme15WallArea(double w, double h) {
        if (w < 0) {
            this.width = 0;
        } else {
            this.width = w;
        } if(h<0) {
            this.height = 0;
        } else {
            this.height= h;
        }
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double w) {
        if (w < 0) {
            this.width = 0;
        } else {
            this.width = w;
        }
    }

    public void setHeight(double h) {
        if (h < 0) {
            this.height = 0;
        } else {
            this.height = h;
        }
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {//call method into main method
        Programme15WallArea wall = new Programme15WallArea(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width=" + wall.getWidth());
        System.out.println("height=" + wall.getHeight());
        System.out.println("area=" + wall.getArea());
    }
}
