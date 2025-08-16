using System;
using Day2.Libraries;

namespace Day2
{
    class Program
    {
        public static void Main(string[] args)
        {
            SignalProcessor signalConverter = new SignalProcessor();

            double inputPower = 500;
            double RefPower = 0.001;
            double powerInDecibels = signalConverter.PowerToDecibel(inputPower, RefPower);
            Console.WriteLine(inputPower + " watts to Decibels is " + powerInDecibels);

            double powerFromDecibels = signalConverter.DecibelToPower(powerInDecibels, RefPower);
            Console.WriteLine(powerInDecibels + " dB to Power is " + powerFromDecibels);

        }
    }

}