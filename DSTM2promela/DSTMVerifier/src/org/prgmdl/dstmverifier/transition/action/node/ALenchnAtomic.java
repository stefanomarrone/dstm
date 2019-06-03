/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.action.node;

import org.prgmdl.dstmverifier.transition.action.analysis.*;

@SuppressWarnings("nls")
public final class ALenchnAtomic extends PAtomic
{
    private TLenbis _lenbis_;
    private PChname _chname_;
    private TRPar _rPar_;

    public ALenchnAtomic()
    {
        // Constructor
    }

    public ALenchnAtomic(
        @SuppressWarnings("hiding") TLenbis _lenbis_,
        @SuppressWarnings("hiding") PChname _chname_,
        @SuppressWarnings("hiding") TRPar _rPar_)
    {
        // Constructor
        setLenbis(_lenbis_);

        setChname(_chname_);

        setRPar(_rPar_);

    }

    @Override
    public Object clone()
    {
        return new ALenchnAtomic(
            cloneNode(this._lenbis_),
            cloneNode(this._chname_),
            cloneNode(this._rPar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALenchnAtomic(this);
    }

    public TLenbis getLenbis()
    {
        return this._lenbis_;
    }

    public void setLenbis(TLenbis node)
    {
        if(this._lenbis_ != null)
        {
            this._lenbis_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lenbis_ = node;
    }

    public PChname getChname()
    {
        return this._chname_;
    }

    public void setChname(PChname node)
    {
        if(this._chname_ != null)
        {
            this._chname_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chname_ = node;
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
            + toString(this._lenbis_)
            + toString(this._chname_)
            + toString(this._rPar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lenbis_ == child)
        {
            this._lenbis_ = null;
            return;
        }

        if(this._chname_ == child)
        {
            this._chname_ = null;
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
        if(this._lenbis_ == oldChild)
        {
            setLenbis((TLenbis) newChild);
            return;
        }

        if(this._chname_ == oldChild)
        {
            setChname((PChname) newChild);
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
