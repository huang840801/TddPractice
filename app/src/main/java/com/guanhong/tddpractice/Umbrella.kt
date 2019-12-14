package com.guanhong.tddpractice

class Umbrella {

    fun totalPrice(weather: IWeather, quantity: Int, price: Int): Int {

        //取得是否是晴天
        val isSunny = weather.isSunny()

        //購買數量 * 價錢
        var totalPrice = quantity * price

        if (isSunny) {
            //晴天 -> 打9折
            totalPrice = (totalPrice * 0.9).toInt()
        }

        return totalPrice
    }
}

class Weather : IWeather {

    override fun isSunny(): Boolean {

        return false
    }
}

/**
 *  假的 Weather
 */
class StubWeather : IWeather {

    //建立屬性，讓外部可設定假的天氣要回傳晴天或雨天
    var fakeIsSunny = false

    override fun isSunny(): Boolean {
        //回傳設定的假天氣
        return fakeIsSunny
    }

}

interface IWeather {

    fun isSunny(): Boolean
}
