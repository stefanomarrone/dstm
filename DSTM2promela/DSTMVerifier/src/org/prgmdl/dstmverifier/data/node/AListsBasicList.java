/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.data.node;

import org.prgmdl.dstmverifier.data.analysis.*;

@SuppressWarnings("nls")
public final class AListsBasicList extends PBasicList
{
    private PBasicList _basicList_;
    private TComma _comma_;
    private PBasic _basic_;

    public AListsBasicList()
    {
        // Constructor
    }

    public AListsBasicList(
        @SuppressWarnings("hiding") PBasicList _basicList_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PBasic _basic_)
    {
        // Constructor
        setBasicList(_basicList_);

        setComma(_comma_);

        setBasic(_basic_);

    }

    @Override
    public Object clone()
    {
        return new AListsBasicList(
            cloneNode(this._basicList_),
            cloneNode(this._comma_),
            cloneNode(this._basic_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListsBasicList(this);
    }

    public PBasicList getBasicList()
    {
        return this._basicList_;
    }

    public void setBasicList(PBasicList node)
    {
        if(this._basicList_ != null)
        {
            this._basicList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._basicList_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PBasic getBasic()
    {
        return this._basic_;
    }

    public void setBasic(PBasic node)
    {
        if(this._basic_ != null)
        {
            this._basic_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._basic_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._basicList_)
            + toString(this._comma_)
            + toString(this._basic_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._basicList_ == child)
        {
            this._basicList_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._basic_ == child)
        {
            this._basic_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._basicList_ == oldChild)
        {
            setBasicList((PBasicList) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._basic_ == oldChild)
        {
            setBasic((PBasic) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
