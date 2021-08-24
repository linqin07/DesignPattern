/**
 * @Description:
 * @author: LinQin
 * @date: 2019/09/18
 */
public class Computer {
    private String cpu; // cpu
    private String hardDisk; //硬盘
    private String mainBoard; // 主板
    private String memory; // 内存

    public Computer() {
    }

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.hardDisk = builder.hardDisk;
        this.mainBoard = builder.mainBoard;
        this.memory = builder.memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }

    public static class Builder {
        private String cpu; // cpu
        private String hardDisk; //硬盘
        private String mainBoard; // 主板
        private String memory; // 内存

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setHardDisk(String hardDisk) {
            this.hardDisk = hardDisk;
            return this;
        }

        public Builder setMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
