/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.action.node;

import org.prgmdl.dstmverifier.transition.action.analysis.*;

@SuppressWarnings("nls")
public final class AChuseAtomic extends PAtomic
{
    private TChn _chn_;
    private TColonColon _colonColon_;
    private PChname _chname_;

    public AChuseAtomic()
    {
        // Constructor
    }

    public AChuseAtomic(
        @SuppressWarnings("hiding") TChn _chn_,
        @SuppressWarnings("hiding") TColonColon _colonColon_,
        @SuppressWarnings("hiding") PChname _chname_)
    {
        // Constructor
        setChn(_chn_);

        setColonColon(_colonColon_);

        setChname(_chname_);

    }

    @Override
    public Object clone()
    {
        return new AChuseAtomic(
            cloneNode(this._chn_),
            cloneNode(this._colonColon_),
            cloneNode(this._chname_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChuseAtomic(this);
    }

    public TChn getChn()
    {
        return this._chn_;
    }

    public void setChn(TChn node)
    {
        if(this._chn_ != null)
        {
            this._chn_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chn_ = node;
    }

    public TColonColon getColonColon()
    {
        return this._colonColon_;
    }

    public void setColonColon(TColonColon node)
    {
        if(this._colonColon_ != null)
        {
            this._colonColon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colonColon_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._chn_)
            + toString(this._colonColon_)
            + toString(this._chname_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._chn_ == child)
        {
            this._chn_ = null;
            return;
        }

        if(this._colonColon_ == child)
        {
            this._colonColon_ = null;
            return;
        }

        if(this._chname_ == child)
        {
            this._chname_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._chn_ == oldChild)
        {
            setChn((TChn) newChild);
            return;
        }

        if(this._colonColon_ == oldChild)
        {
            setColonColon((TColonColon) newChild);
            return;
        }

        if(this._chname_ == oldChild)
        {
            setChname((PChname) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
