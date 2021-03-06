/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.parameter.node;

import org.prgmdl.dstmverifier.transition.parameter.analysis.*;

@SuppressWarnings("nls")
public final class AEqivExpr extends PExpr
{
    private TLPar _lPar_;
    private PFirst _first_;
    private PEqop _eqop_;
    private PSecond _second_;
    private TRPar _rPar_;

    public AEqivExpr()
    {
        // Constructor
    }

    public AEqivExpr(
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PFirst _first_,
        @SuppressWarnings("hiding") PEqop _eqop_,
        @SuppressWarnings("hiding") PSecond _second_,
        @SuppressWarnings("hiding") TRPar _rPar_)
    {
        // Constructor
        setLPar(_lPar_);

        setFirst(_first_);

        setEqop(_eqop_);

        setSecond(_second_);

        setRPar(_rPar_);

    }

    @Override
    public Object clone()
    {
        return new AEqivExpr(
            cloneNode(this._lPar_),
            cloneNode(this._first_),
            cloneNode(this._eqop_),
            cloneNode(this._second_),
            cloneNode(this._rPar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEqivExpr(this);
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public PFirst getFirst()
    {
        return this._first_;
    }

    public void setFirst(PFirst node)
    {
        if(this._first_ != null)
        {
            this._first_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._first_ = node;
    }

    public PEqop getEqop()
    {
        return this._eqop_;
    }

    public void setEqop(PEqop node)
    {
        if(this._eqop_ != null)
        {
            this._eqop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eqop_ = node;
    }

    public PSecond getSecond()
    {
        return this._second_;
    }

    public void setSecond(PSecond node)
    {
        if(this._second_ != null)
        {
            this._second_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._second_ = node;
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lPar_)
            + toString(this._first_)
            + toString(this._eqop_)
            + toString(this._second_)
            + toString(this._rPar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._first_ == child)
        {
            this._first_ = null;
            return;
        }

        if(this._eqop_ == child)
        {
            this._eqop_ = null;
            return;
        }

        if(this._second_ == child)
        {
            this._second_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._first_ == oldChild)
        {
            setFirst((PFirst) newChild);
            return;
        }

        if(this._eqop_ == oldChild)
        {
            setEqop((PEqop) newChild);
            return;
        }

        if(this._second_ == oldChild)
        {
            setSecond((PSecond) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
