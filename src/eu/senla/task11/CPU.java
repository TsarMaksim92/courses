package eu.senla.task11;

import java.util.Objects;

public class CPU {

    private String model;
    private double frequency;

    public CPU(String model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "model='" + model + '\'' +
                ", frequency=" + frequency +
                "} \n\r";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPU cpu = (CPU) o;
        return Double.compare(cpu.frequency, frequency) == 0 && model.equals(cpu.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, frequency);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
