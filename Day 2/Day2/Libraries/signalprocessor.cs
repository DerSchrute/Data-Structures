using System;

namespace Day2.Libraries
{
    class SignalProcessor
    {
        public SignalProcessor()
        {


        }
        public double PowerToDecibel(double power, double referencePower)
        {


            {
                double right = System.Math.Log10(power / referencePower);
                return 10 * right;
            }
        }
            public double DecibelToPower(double Decibel, double referencePower) {
                
                double revRight = System.Math.Pow(10, Decibel / 10);
                return referencePower * revRight;
            }
        }
    }
