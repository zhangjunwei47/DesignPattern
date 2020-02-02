package com.happy.designpattern.builder;

public class Course {
    private String name;
    private String price;
    private String note;
    private String ps;

    public Course(CourseBuilder courseBuilder) {
        this.name = courseBuilder.name;
        this.note = courseBuilder.note;
        this.price = courseBuilder.price;
        this.ps = courseBuilder.ps;
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", note='" + note + '\'' +
                ", ps='" + ps + '\'' +
                '}';
    }

    public static class CourseBuilder {
        private String name;
        private String price;
        private String note;
        private String ps;

        public CourseBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder setPrice(String price) {
            this.price = price;
            return this;
        }

        public CourseBuilder setNote(String note) {
            this.note = note;
            return this;
        }

        public CourseBuilder setPs(String ps) {
            this.ps = ps;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
