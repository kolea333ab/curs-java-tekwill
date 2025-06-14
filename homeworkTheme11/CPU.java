package homeworkTheme11;

class CPU {
    CPU() {
    }

    static class Processor {
        private int cores;
        private double speed;

        public Processor(int cores, double speed) {
            this.cores = cores;
            this.speed = speed;
        }

        public void displayInfo() {
            System.out.println("Процессор:" + this.cores + " cores, " + this.speed + " GHz");
        }
    }

    static class RAM {
        private int size;
        private int speed;

        public RAM(int size, int speed) {
            this.size = size;
            this.speed = speed;
        }

        public void displayInfo() {
            System.out.println("RAM " + this.size + " GB, " + this.speed + " MHz");
        }
    }
}

