package VariableTypes.InstanceVariable;

public class InstanceVariableHiding {
    double height, width, depth;

    InstanceVariableHiding(double height, double width, double depth) {
        // in this block local variable priority will much better
        // if we keep local variable and instance variable same
        // we may face some issue
        // if we write like this
        // height = height;
        // our purpose was to assign local variable to instance variable
        // but here we are assigning local variable to again local variable
        // for this reason our instance variable will hide
        // for this problem we are going to use this key word
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

}