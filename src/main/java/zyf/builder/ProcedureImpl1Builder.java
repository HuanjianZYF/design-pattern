package zyf.builder;

import zyf.factory.IProduct;

import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午4:03
 */
public class ProcedureImpl1Builder implements IProcedureBuilder {

    ProcedureImpl1 procedureImpl1 = new ProcedureImpl1();

    public ProcedureImpl1 getAbstractProcedure() {
        return procedureImpl1;
    }

    public void setSequence(List<Integer> sequence) {
        procedureImpl1.setSequence(sequence);
    }
}
