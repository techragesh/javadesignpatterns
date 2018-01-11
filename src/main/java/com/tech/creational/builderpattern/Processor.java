package com.tech.creational.builderpattern;

import lombok.NonNull;

public class Processor {

    private String panel;
    private String motherBoard;
    private String ram;
    private String hardDisk;

    private Processor(Builder builder){
        this.panel = builder.panel;
        this.motherBoard = builder.motherBoard;
        this.hardDisk = builder.hardDisk;
        this.ram = builder.ram;
    }

    public String getPanel() {
        return panel;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "panel='" + panel + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", ram='" + ram + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                '}';
    }

    public static class Builder {

        private String panel;
        private String motherBoard;
        private String ram;
        private String hardDisk;

        public Builder() {
        }

        public Processor build(){
            return new Processor(this);
        }

        public Builder panel(String panel){
            this.panel = panel;
            return this;
        }

        public Builder motherBoard(String motherBoard){
            this.motherBoard = motherBoard;
            return this;
        }

        public Builder ram(String ram){
            this.ram = ram;
            return this;
        }

        public Builder hardDisk(String hardDisk){
            this.hardDisk = hardDisk;
            return this;
        }
    }
}
