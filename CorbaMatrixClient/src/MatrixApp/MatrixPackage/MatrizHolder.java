package MatrixApp.MatrixPackage;


/**
* MatrixApp/MatrixPackage/MatrizHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Matrix.idl
* Quarta-feira, 14 de Dezembro de 2016 16h14min02s GMT-03:00
*/

public final class MatrizHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[][] = null;

  public MatrizHolder ()
  {
  }

  public MatrizHolder (int[][] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MatrixApp.MatrixPackage.MatrizHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MatrixApp.MatrixPackage.MatrizHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MatrixApp.MatrixPackage.MatrizHelper.type ();
  }

}