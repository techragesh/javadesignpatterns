package com.tech.creational.builderpattern;

public class BuilderDemo {

    public static void main(String[] args) {

       Processor.Builder builder = new Processor.Builder()
               .panel("Black")
               .hardDisk("SanDisk 500GB")
               .ram("8GB")
               .motherBoard("Intel");

       Processor processor =  builder.build();
       System.out.println(processor);

        //Lombok Execution

        ProcessorLombokBO build = ProcessorLombokBO.builder()
                .panel("Brown")
                .hardDisk("SanDisk 256GB")
                .ram("4GB")
                .motherBoard("Intel")
                .build();

        System.out.println(build);
    }
}
