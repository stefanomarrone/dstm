/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.parameter.analysis;

import java.util.*;
import org.prgmdl.dstmverifier.transition.parameter.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPNotation().apply(this);
        outStart(node);
    }

    public void inAListNotation(AListNotation node)
    {
        defaultIn(node);
    }

    public void outAListNotation(AListNotation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListNotation(AListNotation node)
    {
        inAListNotation(node);
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            Collections.reverse(copy);
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outAListNotation(node);
    }

    public void inAAssignStatement(AAssignStatement node)
    {
        defaultIn(node);
    }

    public void outAAssignStatement(AAssignStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignStatement(AAssignStatement node)
    {
        inAAssignStatement(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getAssign() != null)
        {
            node.getAssign().apply(this);
        }
        if(node.getPar() != null)
        {
            node.getPar().apply(this);
        }
        outAAssignStatement(node);
    }

    public void inANullStatement(ANullStatement node)
    {
        defaultIn(node);
    }

    public void outANullStatement(ANullStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANullStatement(ANullStatement node)
    {
        inANullStatement(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getDontcare() != null)
        {
            node.getDontcare().apply(this);
        }
        outANullStatement(node);
    }

    public void inANestedlExpr(ANestedlExpr node)
    {
        defaultIn(node);
    }

    public void outANestedlExpr(ANestedlExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANestedlExpr(ANestedlExpr node)
    {
        inANestedlExpr(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outANestedlExpr(node);
    }

    public void inABoolnotExpr(ABoolnotExpr node)
    {
        defaultIn(node);
    }

    public void outABoolnotExpr(ABoolnotExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolnotExpr(ABoolnotExpr node)
    {
        inABoolnotExpr(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getNot() != null)
        {
            node.getNot().apply(this);
        }
        outABoolnotExpr(node);
    }

    public void inABoolopExpr(ABoolopExpr node)
    {
        defaultIn(node);
    }

    public void outABoolopExpr(ABoolopExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolopExpr(ABoolopExpr node)
    {
        inABoolopExpr(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getSecond() != null)
        {
            node.getSecond().apply(this);
        }
        if(node.getLbop() != null)
        {
            node.getLbop().apply(this);
        }
        if(node.getFirst() != null)
        {
            node.getFirst().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outABoolopExpr(node);
    }

    public void inACompareExpr(ACompareExpr node)
    {
        defaultIn(node);
    }

    public void outACompareExpr(ACompareExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompareExpr(ACompareExpr node)
    {
        inACompareExpr(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getSecond() != null)
        {
            node.getSecond().apply(this);
        }
        if(node.getCmpop() != null)
        {
            node.getCmpop().apply(this);
        }
        if(node.getFirst() != null)
        {
            node.getFirst().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outACompareExpr(node);
    }

    public void inAMathppExpr(AMathppExpr node)
    {
        defaultIn(node);
    }

    public void outAMathppExpr(AMathppExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMathppExpr(AMathppExpr node)
    {
        inAMathppExpr(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getMmop() != null)
        {
            node.getMmop().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outAMathppExpr(node);
    }

    public void inAMathopExpr(AMathopExpr node)
    {
        defaultIn(node);
    }

    public void outAMathopExpr(AMathopExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMathopExpr(AMathopExpr node)
    {
        inAMathopExpr(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getSecond() != null)
        {
            node.getSecond().apply(this);
        }
        if(node.getMbop() != null)
        {
            node.getMbop().apply(this);
        }
        if(node.getFirst() != null)
        {
            node.getFirst().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outAMathopExpr(node);
    }

    public void inAEqivExpr(AEqivExpr node)
    {
        defaultIn(node);
    }

    public void outAEqivExpr(AEqivExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqivExpr(AEqivExpr node)
    {
        inAEqivExpr(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getSecond() != null)
        {
            node.getSecond().apply(this);
        }
        if(node.getEqop() != null)
        {
            node.getEqop().apply(this);
        }
        if(node.getFirst() != null)
        {
            node.getFirst().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outAEqivExpr(node);
    }

    public void inAAtomExpr(AAtomExpr node)
    {
        defaultIn(node);
    }

    public void outAAtomExpr(AAtomExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtomExpr(AAtomExpr node)
    {
        inAAtomExpr(node);
        if(node.getAtomic() != null)
        {
            node.getAtomic().apply(this);
        }
        outAAtomExpr(node);
    }

    public void inAEnumExpr(AEnumExpr node)
    {
        defaultIn(node);
    }

    public void outAEnumExpr(AEnumExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnumExpr(AEnumExpr node)
    {
        inAEnumExpr(node);
        if(node.getLiteral() != null)
        {
            node.getLiteral().apply(this);
        }
        if(node.getColonColon() != null)
        {
            node.getColonColon().apply(this);
        }
        if(node.getEName() != null)
        {
            node.getEName().apply(this);
        }
        outAEnumExpr(node);
    }

    public void inAPlainFirst(APlainFirst node)
    {
        defaultIn(node);
    }

    public void outAPlainFirst(APlainFirst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlainFirst(APlainFirst node)
    {
        inAPlainFirst(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAPlainFirst(node);
    }

    public void inAPlainSecond(APlainSecond node)
    {
        defaultIn(node);
    }

    public void outAPlainSecond(APlainSecond node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlainSecond(APlainSecond node)
    {
        inAPlainSecond(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAPlainSecond(node);
    }

    public void inATrAtomic(ATrAtomic node)
    {
        defaultIn(node);
    }

    public void outATrAtomic(ATrAtomic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATrAtomic(ATrAtomic node)
    {
        inATrAtomic(node);
        if(node.getTrue() != null)
        {
            node.getTrue().apply(this);
        }
        outATrAtomic(node);
    }

    public void inAFaAtomic(AFaAtomic node)
    {
        defaultIn(node);
    }

    public void outAFaAtomic(AFaAtomic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFaAtomic(AFaAtomic node)
    {
        inAFaAtomic(node);
        if(node.getFalse() != null)
        {
            node.getFalse().apply(this);
        }
        outAFaAtomic(node);
    }

    public void inAIdAtomic(AIdAtomic node)
    {
        defaultIn(node);
    }

    public void outAIdAtomic(AIdAtomic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdAtomic(AIdAtomic node)
    {
        inAIdAtomic(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdAtomic(node);
    }

    public void inANumAtomic(ANumAtomic node)
    {
        defaultIn(node);
    }

    public void outANumAtomic(ANumAtomic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumAtomic(ANumAtomic node)
    {
        inANumAtomic(node);
        if(node.getNumbers() != null)
        {
            node.getNumbers().apply(this);
        }
        outANumAtomic(node);
    }

    public void inALenchnAtomic(ALenchnAtomic node)
    {
        defaultIn(node);
    }

    public void outALenchnAtomic(ALenchnAtomic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALenchnAtomic(ALenchnAtomic node)
    {
        inALenchnAtomic(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getChname() != null)
        {
            node.getChname().apply(this);
        }
        if(node.getLenbis() != null)
        {
            node.getLenbis().apply(this);
        }
        outALenchnAtomic(node);
    }

    public void inANeqEqop(ANeqEqop node)
    {
        defaultIn(node);
    }

    public void outANeqEqop(ANeqEqop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANeqEqop(ANeqEqop node)
    {
        inANeqEqop(node);
        if(node.getNeq() != null)
        {
            node.getNeq().apply(this);
        }
        outANeqEqop(node);
    }

    public void inAEqEqop(AEqEqop node)
    {
        defaultIn(node);
    }

    public void outAEqEqop(AEqEqop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqEqop(AEqEqop node)
    {
        inAEqEqop(node);
        if(node.getEq() != null)
        {
            node.getEq().apply(this);
        }
        outAEqEqop(node);
    }

    public void inALteqCmpop(ALteqCmpop node)
    {
        defaultIn(node);
    }

    public void outALteqCmpop(ALteqCmpop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALteqCmpop(ALteqCmpop node)
    {
        inALteqCmpop(node);
        if(node.getLteq() != null)
        {
            node.getLteq().apply(this);
        }
        outALteqCmpop(node);
    }

    public void inALtCmpop(ALtCmpop node)
    {
        defaultIn(node);
    }

    public void outALtCmpop(ALtCmpop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALtCmpop(ALtCmpop node)
    {
        inALtCmpop(node);
        if(node.getLt() != null)
        {
            node.getLt().apply(this);
        }
        outALtCmpop(node);
    }

    public void inAGteqCmpop(AGteqCmpop node)
    {
        defaultIn(node);
    }

    public void outAGteqCmpop(AGteqCmpop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGteqCmpop(AGteqCmpop node)
    {
        inAGteqCmpop(node);
        if(node.getGteq() != null)
        {
            node.getGteq().apply(this);
        }
        outAGteqCmpop(node);
    }

    public void inAGtCmpop(AGtCmpop node)
    {
        defaultIn(node);
    }

    public void outAGtCmpop(AGtCmpop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGtCmpop(AGtCmpop node)
    {
        inAGtCmpop(node);
        if(node.getGt() != null)
        {
            node.getGt().apply(this);
        }
        outAGtCmpop(node);
    }

    public void inAPlusPlusMmop(APlusPlusMmop node)
    {
        defaultIn(node);
    }

    public void outAPlusPlusMmop(APlusPlusMmop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusPlusMmop(APlusPlusMmop node)
    {
        inAPlusPlusMmop(node);
        if(node.getPlusPlus() != null)
        {
            node.getPlusPlus().apply(this);
        }
        outAPlusPlusMmop(node);
    }

    public void inAMinusMinusMmop(AMinusMinusMmop node)
    {
        defaultIn(node);
    }

    public void outAMinusMinusMmop(AMinusMinusMmop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusMinusMmop(AMinusMinusMmop node)
    {
        inAMinusMinusMmop(node);
        if(node.getMinusMinus() != null)
        {
            node.getMinusMinus().apply(this);
        }
        outAMinusMinusMmop(node);
    }

    public void inAPlusMbop(APlusMbop node)
    {
        defaultIn(node);
    }

    public void outAPlusMbop(APlusMbop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusMbop(APlusMbop node)
    {
        inAPlusMbop(node);
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        outAPlusMbop(node);
    }

    public void inAMinusMbop(AMinusMbop node)
    {
        defaultIn(node);
    }

    public void outAMinusMbop(AMinusMbop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusMbop(AMinusMbop node)
    {
        inAMinusMbop(node);
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        outAMinusMbop(node);
    }

    public void inAStarMbop(AStarMbop node)
    {
        defaultIn(node);
    }

    public void outAStarMbop(AStarMbop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStarMbop(AStarMbop node)
    {
        inAStarMbop(node);
        if(node.getStar() != null)
        {
            node.getStar().apply(this);
        }
        outAStarMbop(node);
    }

    public void inASlashMbop(ASlashMbop node)
    {
        defaultIn(node);
    }

    public void outASlashMbop(ASlashMbop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASlashMbop(ASlashMbop node)
    {
        inASlashMbop(node);
        if(node.getSlash() != null)
        {
            node.getSlash().apply(this);
        }
        outASlashMbop(node);
    }

    public void inAAndLbop(AAndLbop node)
    {
        defaultIn(node);
    }

    public void outAAndLbop(AAndLbop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndLbop(AAndLbop node)
    {
        inAAndLbop(node);
        if(node.getAmpAmp() != null)
        {
            node.getAmpAmp().apply(this);
        }
        outAAndLbop(node);
    }

    public void inAOrLbop(AOrLbop node)
    {
        defaultIn(node);
    }

    public void outAOrLbop(AOrLbop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrLbop(AOrLbop node)
    {
        inAOrLbop(node);
        if(node.getBarBar() != null)
        {
            node.getBarBar().apply(this);
        }
        outAOrLbop(node);
    }

    public void inAIdPar(AIdPar node)
    {
        defaultIn(node);
    }

    public void outAIdPar(AIdPar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdPar(AIdPar node)
    {
        inAIdPar(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdPar(node);
    }

    public void inAIdChname(AIdChname node)
    {
        defaultIn(node);
    }

    public void outAIdChname(AIdChname node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdChname(AIdChname node)
    {
        inAIdChname(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdChname(node);
    }

    public void inAIdEName(AIdEName node)
    {
        defaultIn(node);
    }

    public void outAIdEName(AIdEName node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdEName(AIdEName node)
    {
        inAIdEName(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdEName(node);
    }

    public void inAIdLiteral(AIdLiteral node)
    {
        defaultIn(node);
    }

    public void outAIdLiteral(AIdLiteral node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdLiteral(AIdLiteral node)
    {
        inAIdLiteral(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdLiteral(node);
    }
}
