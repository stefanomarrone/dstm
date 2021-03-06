/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.parameter.parser;

import org.prgmdl.dstmverifier.transition.parameter.node.*;
import org.prgmdl.dstmverifier.transition.parameter.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTInt(@SuppressWarnings("unused") TInt node)
    {
        this.index = 0;
    }

    @Override
    public void caseTBool(@SuppressWarnings("unused") TBool node)
    {
        this.index = 1;
    }

    @Override
    public void caseTEnum(@SuppressWarnings("unused") TEnum node)
    {
        this.index = 2;
    }

    @Override
    public void caseTChn(@SuppressWarnings("unused") TChn node)
    {
        this.index = 3;
    }

    @Override
    public void caseTStruct(@SuppressWarnings("unused") TStruct node)
    {
        this.index = 4;
    }

    @Override
    public void caseTOf(@SuppressWarnings("unused") TOf node)
    {
        this.index = 5;
    }

    @Override
    public void caseTTrue(@SuppressWarnings("unused") TTrue node)
    {
        this.index = 6;
    }

    @Override
    public void caseTFalse(@SuppressWarnings("unused") TFalse node)
    {
        this.index = 7;
    }

    @Override
    public void caseTFull(@SuppressWarnings("unused") TFull node)
    {
        this.index = 8;
    }

    @Override
    public void caseTEmpty(@SuppressWarnings("unused") TEmpty node)
    {
        this.index = 9;
    }

    @Override
    public void caseTExternal(@SuppressWarnings("unused") TExternal node)
    {
        this.index = 10;
    }

    @Override
    public void caseTInternal(@SuppressWarnings("unused") TInternal node)
    {
        this.index = 11;
    }

    @Override
    public void caseTNull(@SuppressWarnings("unused") TNull node)
    {
        this.index = 12;
    }

    @Override
    public void caseTIdentifier(@SuppressWarnings("unused") TIdentifier node)
    {
        this.index = 13;
    }

    @Override
    public void caseTNumbers(@SuppressWarnings("unused") TNumbers node)
    {
        this.index = 14;
    }

    @Override
    public void caseTLen(@SuppressWarnings("unused") TLen node)
    {
        this.index = 15;
    }

    @Override
    public void caseTLenbis(@SuppressWarnings("unused") TLenbis node)
    {
        this.index = 16;
    }

    @Override
    public void caseTDontcare(@SuppressWarnings("unused") TDontcare node)
    {
        this.index = 17;
    }

    @Override
    public void caseTSemi(@SuppressWarnings("unused") TSemi node)
    {
        this.index = 18;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 19;
    }

    @Override
    public void caseTQmark(@SuppressWarnings("unused") TQmark node)
    {
        this.index = 20;
    }

    @Override
    public void caseTEmark(@SuppressWarnings("unused") TEmark node)
    {
        this.index = 21;
    }

    @Override
    public void caseTColon(@SuppressWarnings("unused") TColon node)
    {
        this.index = 22;
    }

    @Override
    public void caseTNot(@SuppressWarnings("unused") TNot node)
    {
        this.index = 23;
    }

    @Override
    public void caseTAmpAmp(@SuppressWarnings("unused") TAmpAmp node)
    {
        this.index = 24;
    }

    @Override
    public void caseTBarBar(@SuppressWarnings("unused") TBarBar node)
    {
        this.index = 25;
    }

    @Override
    public void caseTBar(@SuppressWarnings("unused") TBar node)
    {
        this.index = 26;
    }

    @Override
    public void caseTAmp(@SuppressWarnings("unused") TAmp node)
    {
        this.index = 27;
    }

    @Override
    public void caseTCaret(@SuppressWarnings("unused") TCaret node)
    {
        this.index = 28;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 29;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 30;
    }

    @Override
    public void caseTAssign(@SuppressWarnings("unused") TAssign node)
    {
        this.index = 31;
    }

    @Override
    public void caseTColonColon(@SuppressWarnings("unused") TColonColon node)
    {
        this.index = 32;
    }

    @Override
    public void caseTLt(@SuppressWarnings("unused") TLt node)
    {
        this.index = 33;
    }

    @Override
    public void caseTGt(@SuppressWarnings("unused") TGt node)
    {
        this.index = 34;
    }

    @Override
    public void caseTEq(@SuppressWarnings("unused") TEq node)
    {
        this.index = 35;
    }

    @Override
    public void caseTNeq(@SuppressWarnings("unused") TNeq node)
    {
        this.index = 36;
    }

    @Override
    public void caseTLteq(@SuppressWarnings("unused") TLteq node)
    {
        this.index = 37;
    }

    @Override
    public void caseTGteq(@SuppressWarnings("unused") TGteq node)
    {
        this.index = 38;
    }

    @Override
    public void caseTStar(@SuppressWarnings("unused") TStar node)
    {
        this.index = 39;
    }

    @Override
    public void caseTSlash(@SuppressWarnings("unused") TSlash node)
    {
        this.index = 40;
    }

    @Override
    public void caseTPlusPlus(@SuppressWarnings("unused") TPlusPlus node)
    {
        this.index = 41;
    }

    @Override
    public void caseTMinusMinus(@SuppressWarnings("unused") TMinusMinus node)
    {
        this.index = 42;
    }

    @Override
    public void caseTLPar(@SuppressWarnings("unused") TLPar node)
    {
        this.index = 43;
    }

    @Override
    public void caseTRPar(@SuppressWarnings("unused") TRPar node)
    {
        this.index = 44;
    }

    @Override
    public void caseTLBkt(@SuppressWarnings("unused") TLBkt node)
    {
        this.index = 45;
    }

    @Override
    public void caseTRBkt(@SuppressWarnings("unused") TRBkt node)
    {
        this.index = 46;
    }

    @Override
    public void caseTLBrc(@SuppressWarnings("unused") TLBrc node)
    {
        this.index = 47;
    }

    @Override
    public void caseTRBrc(@SuppressWarnings("unused") TRBrc node)
    {
        this.index = 48;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 49;
    }
}
