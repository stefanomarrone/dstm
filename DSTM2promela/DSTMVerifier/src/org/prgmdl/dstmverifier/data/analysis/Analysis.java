/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.data.analysis;

import org.prgmdl.dstmverifier.data.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseANotation(ANotation node);
    void caseAChannelDeclaration(AChannelDeclaration node);
    void caseAEnumDeclaration(AEnumDeclaration node);
    void caseAVariableDeclaration(AVariableDeclaration node);
    void caseAParamDeclaration(AParamDeclaration node);
    void caseACompoundDeclaration(ACompoundDeclaration node);
    void caseAMultitypeDeclaration(AMultitypeDeclaration node);
    void caseAIntVarType(AIntVarType node);
    void caseABoolVarType(ABoolVarType node);
    void caseAENameVarType(AENameVarType node);
    void caseAChantVarType(AChantVarType node);
    void caseAChanVarType(AChanVarType node);
    void caseAIntBasic(AIntBasic node);
    void caseABoolBasic(ABoolBasic node);
    void caseAENameBasic(AENameBasic node);
    void caseAChantBasic(AChantBasic node);
    void caseAChanBasic(AChanBasic node);
    void caseAParamDeclarationParamDeclaration(AParamDeclarationParamDeclaration node);
    void caseAIdentifierPName(AIdentifierPName node);
    void caseAIdentifierMachineName(AIdentifierMachineName node);
    void caseAEnumDeclarationEnumDeclaration(AEnumDeclarationEnumDeclaration node);
    void caseAIdentifierEName(AIdentifierEName node);
    void caseAIdentifierENameUse(AIdentifierENameUse node);
    void caseAIdLiterals(AIdLiterals node);
    void caseAIdsLiterals(AIdsLiterals node);
    void caseAIdentifierLiteral(AIdentifierLiteral node);
    void caseACompoundDeclarationCompoundDeclaration(ACompoundDeclarationCompoundDeclaration node);
    void caseABasicListBasicList(ABasicListBasicList node);
    void caseAListsBasicList(AListsBasicList node);
    void caseAIdentifierCompoundName(AIdentifierCompoundName node);
    void caseAIdentifierCompoundNameUse(AIdentifierCompoundNameUse node);
    void caseABasicSimpletype(ABasicSimpletype node);
    void caseACompoundSimpletype(ACompoundSimpletype node);
    void caseAMultitypeDeclarationMultitypeDeclaration(AMultitypeDeclarationMultitypeDeclaration node);
    void caseAIdentifierMultitypeName(AIdentifierMultitypeName node);
    void caseASimpletypeListSimpletypeList(ASimpletypeListSimpletypeList node);
    void caseAListsSimpleSimpletypeList(AListsSimpleSimpletypeList node);
    void caseAIdentifierMultitypeNameUse(AIdentifierMultitypeNameUse node);
    void caseASimpletypeType(ASimpletypeType node);
    void caseAMultiType(AMultiType node);
    void caseAVariableDeclarationVariableDeclaration(AVariableDeclarationVariableDeclaration node);
    void caseAIdentifierVarName(AIdentifierVarName node);
    void caseAExternalChanDeclarationChannelDeclaration(AExternalChanDeclarationChannelDeclaration node);
    void caseAInternalChanDeclarationChannelDeclaration(AInternalChanDeclarationChannelDeclaration node);
    void caseAIdentifierChanName(AIdentifierChanName node);
    void caseASimpleExtSymbol(ASimpleExtSymbol node);
    void caseASimpleUnique(ASimpleUnique node);
    void caseASimpleDefined(ASimpleDefined node);

    void caseTInt(TInt node);
    void caseTBool(TBool node);
    void caseTEnum(TEnum node);
    void caseTChan(TChan node);
    void caseTStruct(TStruct node);
    void caseTMtype(TMtype node);
    void caseTExternal(TExternal node);
    void caseTInternal(TInternal node);
    void caseTParamkey(TParamkey node);
    void caseTOf(TOf node);
    void caseTTrue(TTrue node);
    void caseTFalse(TFalse node);
    void caseTFull(TFull node);
    void caseTEmpty(TEmpty node);
    void caseTSpaces(TSpaces node);
    void caseTSpace(TSpace node);
    void caseTIdentifier(TIdentifier node);
    void caseTNumbers(TNumbers node);
    void caseTComment(TComment node);
    void caseTCommentSingle(TCommentSingle node);
    void caseTSemi(TSemi node);
    void caseTComma(TComma node);
    void caseTQmark(TQmark node);
    void caseTEmark(TEmark node);
    void caseTColon(TColon node);
    void caseTAmpAmp(TAmpAmp node);
    void caseTBarBar(TBarBar node);
    void caseTBar(TBar node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTAssign(TAssign node);
    void caseTLt(TLt node);
    void caseTGt(TGt node);
    void caseTEq(TEq node);
    void caseTNeq(TNeq node);
    void caseTLteq(TLteq node);
    void caseTGteq(TGteq node);
    void caseTPlusPlus(TPlusPlus node);
    void caseTMinusMinus(TMinusMinus node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBkt(TLBkt node);
    void caseTRBkt(TRBkt node);
    void caseTLBrc(TLBrc node);
    void caseTRBrc(TRBrc node);
    void caseEOF(EOF node);
}
