/*
 * Project: Handy
 * Author : Serdar SIMSEK - ssimsek@outlook.com
 * Desc   : An event-handler system;
 */

package handy.data;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;

public class EventData {
	private boolean bdata;
	private String sdata;
	private byte bytedata;
	private short shortdata;
	private int idata;
	private long ldata;
	private float fdata;
	private double doubledata;
	private char chardata;
	private Vector<?> vdata;
	private ArrayList<?> aldata;
	private List listdata;
	private Object objectData;

	public Object getObjectData() {
		return objectData;
	}

	public void setObjectData(Object objectData) {
		this.objectData = objectData;
	}

	public boolean isBdata() {
		return bdata;
	}

	public void setBdata(boolean bdata) {
		this.bdata = bdata;
	}

	public String getSdata() {
		return sdata;
	}

	public void setSdata(String sdata) {
		this.sdata = sdata;
	}

	public byte getBytedata() {
		return bytedata;
	}

	public void setBytedata(byte bytedata) {
		this.bytedata = bytedata;
	}

	public short getShortdata() {
		return shortdata;
	}

	public void setShortdata(short shortdata) {
		this.shortdata = shortdata;
	}

	public int getIdata() {
		return idata;
	}

	public void setIdata(int idata) {
		this.idata = idata;
	}

	public long getLdata() {
		return ldata;
	}

	public void setLdata(long ldata) {
		this.ldata = ldata;
	}

	public float getFdata() {
		return fdata;
	}

	public void setFdata(float fdata) {
		this.fdata = fdata;
	}

	public double getDoubledata() {
		return doubledata;
	}

	public void setDoubledata(double doubledata) {
		this.doubledata = doubledata;
	}

	public char getChardata() {
		return chardata;
	}

	public void setChardata(char chardata) {
		this.chardata = chardata;
	}

	public Vector<?> getVdata() {
		return vdata;
	}

	public void setVdata(Vector<?> vdata) {
		this.vdata = vdata;
	}

	public ArrayList<?> getAldata() {
		return aldata;
	}

	public void setAldata(ArrayList<?> aldata) {
		this.aldata = aldata;
	}

	public List getListdata() {
		return listdata;
	}

	public void setListdata(List listdata) {
		this.listdata = listdata;
	}

	public EventData() {
	}

}
