package com.mk.xebia.solid.lsp;

public class NoTailCreature extends Animal{

	private Organ notail = new Organ("Tail");

	public Organ getTail() {
        return notail;
    }
}
