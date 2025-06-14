package homeworkTheme11;

class MotherBoard {
    MotherBoard() {
    }

    static class USB {
        private String version;
        private int ports;

        public USB(String version, int ports) {
            this.version = version;
            this.ports = ports;
        }

        public void displayInfo() {
            System.out.println("USB " + this.version + " версия, " + this.ports + " порты");
        }
    }
}
