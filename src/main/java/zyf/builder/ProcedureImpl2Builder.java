package zyf.builder;

import java.util.List;

/**
 * @Author zyf
 * @CreateAt 2018/3/24 下午4:11
 */
public class ProcedureImpl2Builder implements IProcedureBuilder {

    ProcedureImpl2 procedureImpl2 = new ProcedureImpl2();

    public ProcedureImpl2 getAbstractProcedure() {
        return procedureImpl2;
    }

    public void setSequence(List<Integer> sequence) {
        procedureImpl2.setSequence(sequence);
    }
}
