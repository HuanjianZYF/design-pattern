package zyf.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午4:12
 * 导演类，其实就是一个工厂
 */
public class Director {

    private ProcedureImpl1Builder procedureImpl1Builder;
    private ProcedureImpl2Builder procedureImpl2Builder;

    public ProcedureImpl1 createImpl1() {
        List<Integer> sequence = new ArrayList<Integer>(4);
        sequence.add(1);
        sequence.add(2);
        sequence.add(4);
        sequence.add(3);
        procedureImpl1Builder.setSequence(sequence);
        return procedureImpl1Builder.getAbstractProcedure();
    }

    public ProcedureImpl2 createImpl2() {
        List<Integer> sequence = new ArrayList<Integer>(4);
        sequence.add(1);
        sequence.add(4);
        sequence.add(2);
        sequence.add(3);
        procedureImpl2Builder.setSequence(sequence);
        return procedureImpl2Builder.getAbstractProcedure();
    }
}
