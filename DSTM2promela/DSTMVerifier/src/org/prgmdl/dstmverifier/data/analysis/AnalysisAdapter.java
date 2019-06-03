/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.data.analysis;

import java.util.*;
import org.prgmdl.dstmverifier.data.node.*;

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

    public void caseANotation(ANotation node)
    {
        defaultCase(node);
    }

    public void caseAChannelDeclaration(AChannelDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAEnumDeclaration(AEnumDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAVariableDeclaration(AVariableDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAParamDeclaration(AParamDeclaration node)
    {
        defaultCase(node);
    }

    public void caseACompoundDeclaration(ACompoundDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAMultitypeDeclaration(AMultitypeDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAIntVarType(AIntVarType node)
    {
        defaultCase(node);
    }

    public void caseABoolVarType(ABoolVarType node)
    {
        defaultCase(node);
    }

    public void caseAENameVarType(AENameVarType node)
    {
        defaultCase(node);
    }

    public void caseAChantVarType(AChantVarType node)
    {
        defaultCase(node);
    }

    public void caseAChanVarType(AChanVarType node)
    {
        defaultCase(node);
    }

    public void caseAIntBasic(AIntBasic node)
    {
        defaultCase(node);
    }

    public void caseABoolBasic(ABoolBasic node)
    {
        defaultCase(node);
    }

    public void caseAENameBasic(AENameBasic node)
    {
        defaultCase(node);
    }

    public void caseAChantBasic(AChantBasic node)
    {
        defaultCase(node);
    }

    public void caseAChanBasic(AChanBasic node)
    {
        defaultCase(node);
    }

    public void caseAParamDeclarationParamDeclaration(AParamDeclarationParamDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierPName(AIdentifierPName node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierMachineName(AIdentifierMachineName node)
    {
        defaultCase(node);
    }

    public void caseAEnumDeclarationEnumDeclaration(AEnumDeclarationEnumDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierEName(AIdentifierEName node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierENameUse(AIdentifierENameUse node)
    {
        defaultCase(node);
    }

    public void caseAIdLiterals(AIdLiterals node)
    {
        defaultCase(node);
    }

    public void caseAIdsLiterals(AIdsLiterals node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierLiteral(AIdentifierLiteral node)
    {
        defaultCase(node);
    }

    public void caseACompoundDeclarationCompoundDeclaration(ACompoundDeclarationCompoundDeclaration node)
    {
        defaultCase(node);
    }

    public void caseABasicListBasicList(ABasicListBasicList node)
    {
        defaultCase(node);
    }

    public void caseAListsBasicList(AListsBasicList node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierCompoundName(AIdentifierCompoundName node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierCompoundNameUse(AIdentifierCompoundNameUse node)
    {
        defaultCase(node);
    }

    public void caseABasicSimpletype(ABasicSimpletype node)
    {
        defaultCase(node);
    }

    public void caseACompoundSimpletype(ACompoundSimpletype node)
    {
        defaultCase(node);
    }

    public void caseAMultitypeDeclarationMultitypeDeclaration(AMultitypeDeclarationMultitypeDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierMultitypeName(AIdentifierMultitypeName node)
    {
        defaultCase(node);
    }

    public void caseASimpletypeListSimpletypeList(ASimpletypeListSimpletypeList node)
    {
        defaultCase(node);
    }

    public void caseAListsSimpleSimpletypeList(AListsSimpleSimpletypeList node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierMultitypeNameUse(AIdentifierMultitypeNameUse node)
    {
        defaultCase(node);
    }

    public void caseASimpletypeType(ASimpletypeType node)
    {
        defaultCase(node);
    }

    public void caseAMultiType(AMultiType node)
    {
        defaultCase(node);
    }

    public void caseAVariableDeclarationVariableDeclaration(AVariableDeclarationVariableDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierVarName(AIdentifierVarName node)
    {
        defaultCase(node);
    }

    public void caseAExternalChanDeclarationChannelDeclaration(AExternalChanDeclarationChannelDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAInternalChanDeclarationChannelDeclaration(AInternalChanDeclarationChannelDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierChanName(AIdentifierChanName node)
    {
        defaultCase(node);
    }

    public void caseASimpleExtSymbol(ASimpleExtSymbol node)
    {
        defaultCase(node);
    }

    public void caseASimpleUnique(ASimpleUnique node)
    {
        defaultCase(node);
    }

    public void caseASimpleDefined(ASimpleDefined node)
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

    public void caseTChan(TChan node)
    {
        defaultCase(node);
    }

    public void caseTStruct(TStruct node)
    {
        defaultCase(node);
    }

    public void caseTMtype(TMtype node)
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

    public void caseTParamkey(TParamkey node)
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

    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTNumbers(TNumbers node)
    {
        defaultCase(node);
    }

    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    public void caseTCommentSingle(TCommentSingle node)
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

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTAssign(TAssign node)
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
