/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.action.analysis;

import java.util.*;
import org.prgmdl.dstmverifier.transition.action.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseASimpleNotation(ASimpleNotation node)
    {
        defaultCase(node);
    }

    public void caseAListNotation(AListNotation node)
    {
        defaultCase(node);
    }

    public void caseASimpleStatementlist(ASimpleStatementlist node)
    {
        defaultCase(node);
    }

    public void caseAReceiveStatement(AReceiveStatement node)
    {
        defaultCase(node);
    }

    public void caseAConserveStatement(AConserveStatement node)
    {
        defaultCase(node);
    }

    public void caseAAssignStatement(AAssignStatement node)
    {
        defaultCase(node);
    }

    public void caseASendStatement(ASendStatement node)
    {
        defaultCase(node);
    }

    public void caseATokAssign(ATokAssign node)
    {
        defaultCase(node);
    }

    public void caseASimpleExprlist(ASimpleExprlist node)
    {
        defaultCase(node);
    }

    public void caseAComplexExprlist(AComplexExprlist node)
    {
        defaultCase(node);
    }

    public void caseANestedlExpr(ANestedlExpr node)
    {
        defaultCase(node);
    }

    public void caseABoolnotExpr(ABoolnotExpr node)
    {
        defaultCase(node);
    }

    public void caseABoolopExpr(ABoolopExpr node)
    {
        defaultCase(node);
    }

    public void caseACompareExpr(ACompareExpr node)
    {
        defaultCase(node);
    }

    public void caseAMathppExpr(AMathppExpr node)
    {
        defaultCase(node);
    }

    public void caseAMathopExpr(AMathopExpr node)
    {
        defaultCase(node);
    }

    public void caseAEqivExpr(AEqivExpr node)
    {
        defaultCase(node);
    }

    public void caseAAtomExpr(AAtomExpr node)
    {
        defaultCase(node);
    }

    public void caseAEnumExpr(AEnumExpr node)
    {
        defaultCase(node);
    }

    public void caseAPlainFirst(APlainFirst node)
    {
        defaultCase(node);
    }

    public void caseAPlainSecond(APlainSecond node)
    {
        defaultCase(node);
    }

    public void caseATrAtomic(ATrAtomic node)
    {
        defaultCase(node);
    }

    public void caseAFaAtomic(AFaAtomic node)
    {
        defaultCase(node);
    }

    public void caseAIdAtomic(AIdAtomic node)
    {
        defaultCase(node);
    }

    public void caseAChuseAtomic(AChuseAtomic node)
    {
        defaultCase(node);
    }

    public void caseANumAtomic(ANumAtomic node)
    {
        defaultCase(node);
    }

    public void caseALenchnAtomic(ALenchnAtomic node)
    {
        defaultCase(node);
    }

    public void caseANeqEqop(ANeqEqop node)
    {
        defaultCase(node);
    }

    public void caseAEqEqop(AEqEqop node)
    {
        defaultCase(node);
    }

    public void caseALteqCmpop(ALteqCmpop node)
    {
        defaultCase(node);
    }

    public void caseALtCmpop(ALtCmpop node)
    {
        defaultCase(node);
    }

    public void caseAGteqCmpop(AGteqCmpop node)
    {
        defaultCase(node);
    }

    public void caseAGtCmpop(AGtCmpop node)
    {
        defaultCase(node);
    }

    public void caseAPlusPlusMmop(APlusPlusMmop node)
    {
        defaultCase(node);
    }

    public void caseAMinusMinusMmop(AMinusMinusMmop node)
    {
        defaultCase(node);
    }

    public void caseAPlusMbop(APlusMbop node)
    {
        defaultCase(node);
    }

    public void caseAMinusMbop(AMinusMbop node)
    {
        defaultCase(node);
    }

    public void caseAStarMbop(AStarMbop node)
    {
        defaultCase(node);
    }

    public void caseASlashMbop(ASlashMbop node)
    {
        defaultCase(node);
    }

    public void caseAAndLbop(AAndLbop node)
    {
        defaultCase(node);
    }

    public void caseAOrLbop(AOrLbop node)
    {
        defaultCase(node);
    }

    public void caseASimpleExtvarlist(ASimpleExtvarlist node)
    {
        defaultCase(node);
    }

    public void caseAComplexExtvarlist(AComplexExtvarlist node)
    {
        defaultCase(node);
    }

    public void caseAVarExtvar(AVarExtvar node)
    {
        defaultCase(node);
    }

    public void caseADontExtvar(ADontExtvar node)
    {
        defaultCase(node);
    }

    public void caseAIdVar(AIdVar node)
    {
        defaultCase(node);
    }

    public void caseAIdChname(AIdChname node)
    {
        defaultCase(node);
    }

    public void caseAIdEName(AIdEName node)
    {
        defaultCase(node);
    }

    public void caseAIdLiteral(AIdLiteral node)
    {
        defaultCase(node);
    }

    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    public void caseTBool(TBool node)
    {
        defaultCase(node);
    }

    public void caseTEnum(TEnum node)
    {
        defaultCase(node);
    }

    public void caseTChn(TChn node)
    {
        defaultCase(node);
    }

    public void caseTStruct(TStruct node)
    {
        defaultCase(node);
    }

    public void caseTOf(TOf node)
    {
        defaultCase(node);
    }

    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }

    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }

    public void caseTFull(TFull node)
    {
        defaultCase(node);
    }

    public void caseTEmpty(TEmpty node)
    {
        defaultCase(node);
    }

    public void caseTSpaces(TSpaces node)
    {
        defaultCase(node);
    }

    public void caseTSpace(TSpace node)
    {
        defaultCase(node);
    }

    public void caseTExternal(TExternal node)
    {
        defaultCase(node);
    }

    public void caseTInternal(TInternal node)
    {
        defaultCase(node);
    }

    public void caseTNull(TNull node)
    {
        defaultCase(node);
    }

    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTNumbers(TNumbers node)
    {
        defaultCase(node);
    }

    public void caseTLen(TLen node)
    {
        defaultCase(node);
    }

    public void caseTLenbis(TLenbis node)
    {
        defaultCase(node);
    }

    public void caseTDontcare(TDontcare node)
    {
        defaultCase(node);
    }

    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTQmark(TQmark node)
    {
        defaultCase(node);
    }

    public void caseTEmark(TEmark node)
    {
        defaultCase(node);
    }

    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    public void caseTAmpAmp(TAmpAmp node)
    {
        defaultCase(node);
    }

    public void caseTBarBar(TBarBar node)
    {
        defaultCase(node);
    }

    public void caseTBar(TBar node)
    {
        defaultCase(node);
    }

    public void caseTAmp(TAmp node)
    {
        defaultCase(node);
    }

    public void caseTCaret(TCaret node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTAssigntok(TAssigntok node)
    {
        defaultCase(node);
    }

    public void caseTColonColon(TColonColon node)
    {
        defaultCase(node);
    }

    public void caseTLt(TLt node)
    {
        defaultCase(node);
    }

    public void caseTGt(TGt node)
    {
        defaultCase(node);
    }

    public void caseTEq(TEq node)
    {
        defaultCase(node);
    }

    public void caseTNeq(TNeq node)
    {
        defaultCase(node);
    }

    public void caseTLteq(TLteq node)
    {
        defaultCase(node);
    }

    public void caseTGteq(TGteq node)
    {
        defaultCase(node);
    }

    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    public void caseTPlusPlus(TPlusPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinusMinus(TMinusMinus node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTLBkt(TLBkt node)
    {
        defaultCase(node);
    }

    public void caseTRBkt(TRBkt node)
    {
        defaultCase(node);
    }

    public void caseTLBrc(TLBrc node)
    {
        defaultCase(node);
    }

    public void caseTRBrc(TRBrc node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
